import adapter_method.ColateralDamage;
import adapter_method.Fighter;
import adapter_method.Wizard;
import adapter_method.WizardAdapter;

import java.lang.reflect.Field;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ColateralDamage damage = new ColateralDamage(100);
        Fighter fighter= new Fighter(10);
        System.out.println(damage.getDamage(fighter));

        Wizard wizard = new Wizard(10);
        WizardAdapter wizardadapter = new WizardAdapter(wizard);
         System.out.println(damage.getDamage(wizardadapter));
    }

}