/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

public abstract class Character{

final protected int base_HP, base_strength, base_defense, base_level;
final protected double base_attack;
final protected String base_type;
final protected String base_name;

protected int HP, strength, defense, level;
protected double attack;
protected String name, type;


protected Character(){
    this(100, 1, 1, 20, 1, "Warrior", "Default");
}

protected Character(String temp_type){
    this(100, 1, 1, 20, 1, temp_type, "Default");
}
protected Character(int temp_HP, int temp_strength, int temp_defense, double temp_attack, int temp_level, String temp_type, String foo){
    base_HP = temp_HP;
    base_strength = strength = temp_strength;
    base_defense = defense = temp_defense;
    base_attack = attack = temp_attack;
    base_name = name = foo;
    base_level = level = temp_level;
    base_type = type = temp_type;
}



protected boolean isAlive(){
    return HP>0;
}
protected int getDefense(){
    return defense;
} 

protected void lowerHP(int foo){
    HP = HP - foo;
}

protected int attack(Character foo){
int damage = (int)(strength*attack - foo.getDefense());
return damage;
}

public void specialize(){
defense--;
attack++;
}

public String getName(){
    return name;
}

public void normalize(){
defense = base_defense;
attack = base_attack;
}

protected int getHP(){
    return HP;
} 
protected int getStrength(){
    return strength;
} 
protected int getLevel(){
    return level;
} 
protected double getAttack(){
    return attack;
} 

protected String getType(){
    return type;
}

    public abstract String about();

public static void main(String[] args){
    System.out.println(about());
    
}


}



