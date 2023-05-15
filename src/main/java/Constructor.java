public class Constructor extends Toys {
    static int num = 0;

    public Constructor(int userInput) {
        this.name = "Constructor_id_" + (++num);
        this.scpecificGravity = userInput;
    }

    public Constructor() {
        this.name = "Constructor_id_" + (++num);
    }

}