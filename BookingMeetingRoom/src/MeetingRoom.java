

/**
 *
 * @author this class use for collect information of size
 */
public class MeetingRoom {

    private int sizeS;
    private int sizeM;
    private int sizeL;

    /**
     *
     * @param sizeS correct int size s
     * @param sizeM correct int size m
     * @param sizeL correct int size l
     */
    public MeetingRoom(int sizeS, int sizeM, int sizeL) {
        this.sizeS = sizeS;
        this.sizeM = sizeM;
        this.sizeL = sizeL;
    }

    /**
     *display that size have how many room
     */
    public void getMeetingRoom() {
        System.out.println("size S : " + sizeS);
        System.out.println("size M : " + sizeM);
        System.out.println("size L : " + sizeL);

    }

    public void decrease(char size) {
        switch (size) {
            case 's':
                --this.sizeS;
                break;
            case 'm':
                --this.sizeM;
                break;
            case 'l':
                --this.sizeL;
                break;
            default:
                break;
        }
    }

    public int getSizeS() {
        return sizeS;
    }

    public int getSizeM() {
        return sizeM;
    }

    public int getSizeL() {
        return sizeL;
    }

    public void increase(char size) {
        switch (size) {
            case 's':
                ++this.sizeS;
                break;
            case 'm':
                ++this.sizeM;
                break;
            case 'l':
                ++this.sizeL;
                break;
            default:
                break;
        }
    }

}
