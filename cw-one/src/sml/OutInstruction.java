package sml;

/**
 * This class prints the contents of a register onto the Java console.
 *
 * @author someone
 */
public class OutInstruction extends Instruction {
    
    private int register;
    private int value;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println(m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " prints as " + value;
    }
    
}