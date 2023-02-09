package adapter_method;


public class WizardAdapter extends Fighter {
    private Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }
    @Override
    public int getPhisycalAttack() {
        int result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (int) (wizard.getMagicalAttack()*2);
        return result;
    }
}
