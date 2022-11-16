public class Mario implements Contract {
    private String character; //The character used in the game(Mario or Luigi)
    private int tokens; // amount of tokens character collects
    private int shrooms; //amount of mushroooms character collects
    private String item; 
    private int hitPoints; //Character's healthlife
    private boolean direction;
    private boolean backward;
    private boolean foward;
    private int feathers; //object that allows Mario to fly

public Mario(int shrooms, String character, int tokens){
   this.shrooms = 0;
   this.character = character;
   this.tokens = 0;  // default value of amount of tokens set to 0
   this.hitPoints = 6; // default value of amount of hitpoints set to 6
}

//acessors
public int shrooms(){
    return this.shrooms;
  }

  public int tokens(){
    return this.tokens();
  }

  public String character(){
    return this.character;
  }


/** 
   *  Choose which character you want to be. Prints the saying of said character
   *  @param name name of the character
   */
public void player(String name){
    if (this.character == "Mario")
        System.out.println("Mario time!");
    if (this.character == "Luigi")
        System.out.println("Luigi time!");
    }

/** 
   *  When needed to the character grabs tokens
   *  @param item what the character can grab
   */

public void grab(String item) {
    if (this.tokens == 0)
        System.out.println("Go grab tokens");
    if (this.tokens == 1)
        this.tokens =+ 1; //adds one to the previous amount of tokens
        System.out.println("You got a token!");
}

/** 
   *  Wether or not the character needs to drop a token 
   *  @param item what the character drops 
   * @return the item you are dropping
   */

public String drop(String item) {
    if (this.tokens == 5 || this.tokens > 5){
        System.out.println("Too many tokens. Drop one!");
        this.tokens =- 1; //subtracting 1 from current amount of tokens
    }else{
        System.out.println("You still have more space");
    }
    return item;
}

/** 
   *  If the character needs to examine wether they have an enemy in front of them
   *  @param item what is the character's enemy
   */
public void examine(String item) {
    if (this.item == "goombas"){
        System.out.println("Something is in your way. Examine the obstacle");
    }else{
        System.out.println("Keep going foward but beware");
    }
    
}

/** 
   *  What the character can use if they have enough shrooms
   *  @param item what the character uses
   */
public void use(String item) {
    if (this.shrooms == 2){
        System.out.println("You have used two shrooms. You can now double jump!");
    }
    if (this.shrooms == 4){
        System.out.println("You have used four shrooms. You can now sprint!");
    }
    if (this.shrooms == 6){
        System.out.println("You have used six shrooms. You can now turn invisible!");
    }
    
}

/** 
   *  Wether or not the character walks foward or backwards
   *  @param direction the direction the character walks in
   * @return T/F wether or not the character can walk
   */
public boolean walk(String direction) {
    if (this.direction == foward){
        System.out.println("You are walking foward!");
    }
    if (this.direction == backward){
        System.out.println("You are walking backward");
    }
    return true;

}

/** 
   *  What it takes for the character to fly
   *  @param shrooms the amount of shrooms the character has
   * @param feathers the amount of feathers the character has
   * @return T/F wether or not the character can fly
   */
public boolean fly(int shrooms, int feathers) {
    if (this.shrooms == 7){
        System.out.println("You have collected enough to fly");
    }
    if (this.feathers == 2){
        System.out.println("You have collected enough feathers to fly!");
    }
    return true;
}

/** 
   *  What it takes for the character to shrink
   * @return The amount of hitpoints the character has 
   */
public Number shrink() {
    if (this.hitPoints == 1){
        System.out.println("Character will shrink");
    }else{
        System.out.println("Character will stay at normal size");
    }
    return this.hitPoints;
}

/** 
   *  What it takes for the character to grow
   * @return the amount of shrooms
   */
public Number grow() {
    if (this.shrooms == 1){
        System.out.println("Character becomes big");
    }else{
        System.out.println("character stays normal size");
    }
    return this.shrooms;
}

/** 
   *  If the character is dead they are resting. If not they are still on their feet
   */
public void rest() {
    if(this.hitPoints == 0){
        System.out.println("Character is dead. Now resting");
    }else{
        System.out.println("Character still on his feet");
    }
    
}

/** 
   *  If the character has enough tokens they can undo the game and return to their latest checkpoint
   */
public void undo() {
    if (this.tokens > 10){
        System.out.println("You have used 10 tokens. Your progress has been saved. You will be revived at the last checkpoint");
    }
    if (this.tokens < 10){
        System.out.println("You do not have enough tokens. You unfortunatley must restart this level");
    }
    
}

public static void main(String[] args) {
    Mario Player = new Mario(4, "Mario", 1);
    System.out.println(Player);
  }

    


}

