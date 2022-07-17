package ru.netology.sqr;

public class SQRService {

    public int squareServ(int x, int y) {
        int numOccur = 0;
        for (int z = 10; z <= 99; z++) {
            if (z * z >= x && z * z <= y) {
                numOccur++;
            }
        }
        return numOccur;
    }
}
