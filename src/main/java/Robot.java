
public class Robot extends Toys {
    static int num = 0;

    public Robot(int userInput) {
        this.name = "Robot_id_" + (++num);
        this.scpecificGravity = userInput;
    }

    public Robot() {
        this.name = "Robot_id_" + (++num);
    }

}