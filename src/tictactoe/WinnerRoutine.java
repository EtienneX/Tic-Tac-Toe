package tictactoe;

import java.util.Timer;
import java.util.TimerTask;

public class WinnerRoutine {
    Timer time;
    public WinnerRoutine(){
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(GUI.winner == 0){
                    // Row 1 for X - Horizontal
                    if (GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1) {
                        GUI.winner = 1;
                    }
                    // Row 2 for X - Horizontal
                    else if (GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 1) {
                        GUI.winner = 1;
                    }

                    // Row 3 for X - Horizontal
                    else if (GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1) {
                        GUI.winner = 1;
                    }

                    // Row 1 for X - Vertical
                    else if (GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 1) {
                        GUI.winner = 1;
                    }

                    // Row 2 for X - Vertical
                    else if (GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 1) {
                        GUI.winner = 1;
                    }

                    // Row 3 for X - Vertical
                    else if (GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 1) {
                        GUI.winner = 1;
                    }

                    // X L-->R (DOWN)
                    else if (GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 1) {
                        GUI.winner = 1;
                    }

                    // X R-->L (UP)
                    else if (GUI.state[2] == 1 && GUI.state[4] == 1 && GUI.state[6] == 1) {
                        GUI.winner = 1;
                    }

                    ////////////////////////////////////////////////////////////////////////

                    // Row 1 for O - Horizontal
                    if (GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2) {
                        GUI.winner = 2;
                        System.out.println("Hallo");
                    }
                    // Row 2 for O - Horizontal
                    else if (GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 2) {
                        GUI.winner = 2;
                    }

                    // Row 3 for O - Horizontal
                    else if (GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2) {
                        GUI.winner = 2;
                    }

                    // Row 1 for O - Vertical
                    else if (GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 2) {
                        GUI.winner = 2;
                    }

                    // Row 2 for O - Vertical
                    else if (GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 2) {
                        GUI.winner = 2;
                    }

                    // Row 3 for O - Vertical
                    else if (GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 2) {
                        GUI.winner = 2;
                    }

                    // O L-->R (DOWN)
                    else if (GUI.state[0] == 1 && GUI.state[4] == 2 && GUI.state[8] == 2) {
                        GUI.winner = 2;
                    }

                    // O R-->L (UP)
                    else if (GUI.state[2] == 1 && GUI.state[4] == 2 && GUI.state[6] == 2) {
                        GUI.winner = 2;
                    }
                }
            }
        },0,150);
    }
}
