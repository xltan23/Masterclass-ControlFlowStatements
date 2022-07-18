package cfs.fp;

public class FlourPacker {
    public static void main(String[] args) {
        boolean packable = canPack(6, 2, 17);
        System.out.println("The packs are packable: " + packable); 
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigMass = bigCount*5;
        int smallMass = smallCount*1;
        int totalMass = bigMass + smallMass;

        if (totalMass < goal) {
            return false;
        }

        if (goal < 5) {
            if (smallMass >= goal) {
                return true;
            } else {
                return false;
            }
        }

        if (goal >= 5) {
            if (smallMass >= goal) {
                return true;
            } else {
                if (bigMass >= goal) {
                    if (goal % 5 == 0) {
                        return true;
                    } else {
                        int massRemain = goal % 5;
                        if (massRemain <= smallMass) {
                            return true;
                        } else {
                             return false;
                        }
                    }
                } 
            }

        }
        return true;
    }
}
