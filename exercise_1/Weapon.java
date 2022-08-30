public class Weapon {
  // Attributes
String name;
int damage;
int weight;
String rarity;
String description;

//Constructor
public Weapon(String WeaponName, int Weapondamage, int Weaponweight, String Weaponrarity, String WeaponDescription) {
 
  name = WeaponName;
  damage = Weapondamage;
  weight = Weaponweight;
  rarity = Weaponrarity;
  description = WeaponDescription;
}

//Method 
public void weaponDescription() {
  System.out.print("\n");
  
  System.out.println("Weapon Name: " + name);
  System.out.println("Attack: " + damage);
  System.out.println("Weight: " + weight);
  System.out.println("Rarity: " + rarity);
  System.out.println("Description: " + description);
}
}
  
