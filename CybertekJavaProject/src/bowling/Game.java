package bowling;

public class Game {

    private int roll = 0;
    private int[] rolls = new int[21];

    public void roll(int pinsDown){
        rolls[roll++] = pinsDown;
    }

    public void roll(int[] rolls){  //(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1)
        for(int i = 0; i < rolls.length; i++){
            roll(rolls[i]);
        }
    }

    private boolean isSpare(int pair){
        return rolls[pair] + rolls[pair+1] == 10;
    }

    private boolean isStrike(int pair){
        return rolls[pair] == 10;
    }

    public int score(){
        int score = 0;
        int pair = 0;
        for(int frame = 0; frame < 10; frame++){
            if(isStrike(pair)){
                score += 10 + rolls[pair+1] + rolls[pair+2];
                pair++;
            }else if(isSpare(pair)){
                score += 10 + rolls[pair+2];
                pair += 2;
            }else{
                score += rolls[pair] + rolls[pair+1];
                pair += 2;
            }
        }
        return score;
    }
}
