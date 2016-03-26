package sml;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
public class Translator {

    private static final String PATH = "C:\\Users\\James\\Documents\\NetBeansProjects\\SDP Portfolio\\cw-one\\src\\";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = PATH + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            System.exit(-1);
            return false;
        }
        return true;
    }

    // line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstruction(String label) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        if (line.equals("")) return null;

        try {
            // Get class name
            String ins = scan();
            Class cls = Class.forName("sml." + ins.trim().toUpperCase().charAt(0) + ins.substring(1).toLowerCase() + "Instruction");
            
            // Get constructors and loop through them
            Constructor[] cons = cls.getConstructors();
            for(Constructor c : cons) {
                
                int paramCount = c.getParameterCount();
                
                // If parameter count > 2 then loop through the types
                if(paramCount > 2){
                    
                    ArrayList<Object> params = new ArrayList<>();
                    
                    params.add(label);
                    
                    Class[] paramTypes = c.getParameterTypes();
                    for(int i = 1; i < paramTypes.length; i++) {
                        
                        // Scan variables according to class type
                        switch(paramTypes[i].getSimpleName()) {
                            case "String": params.add(i, scan());
                                break;
                            case "int": params.add(i, scanInt());
                                break;
                        }
                        
                    }
                    
                    Instruction i = (Instruction) c.newInstance(params.toArray());
                    
                    return i;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0) return "";
        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
    
}