package tictactoe;

public class Function {
    public static void Reset(){
        for (int i=0;i<GUI.state.length; i++){
            GUI.state[i] = 0;
        }
        GUI.Player = 0;
        GUI.winner = 0;
    }
}
