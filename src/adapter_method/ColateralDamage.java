package adapter_method;

public class ColateralDamage {
    private int hp;
    public ColateralDamage(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
    public int getDamage(Fighter fighter) {
        int result;
        result = this.getHp() - fighter.getPhisycalAttack();
        return result;
    }
}
