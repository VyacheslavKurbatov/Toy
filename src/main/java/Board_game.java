public class Board_game extends Toys {
    static int num = 0;

    public Board_game(int userInput) {
        this.name = "BoadrGame_id_" + (++num);
        this.scpecificGravity = userInput;
    }

    public Board_game() {
        this.name = "BoadrGame_id_" + (++num);
    }

    public static Board_game CreateBoadrGame() {
        return new Board_game();
    }
}