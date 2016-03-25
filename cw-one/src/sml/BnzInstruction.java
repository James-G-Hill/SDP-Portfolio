package sml;

/**
 * This class changes the order of instruction.
 *
 * @author someone
 */
public class BnzInstruction extends Instruction {
    
    private int register;
    private String value;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String value) {
        super(label, "bnz");
        this.register = register;
        this.value = value;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0){
            m.setPc(m.getLabels().indexOf(value));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " moves to " + value;
    }
    
}