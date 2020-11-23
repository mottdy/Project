/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Function {


    MeetingRoom action = new MeetingRoom(5, 3, 2);

    public void book(char size) {
        action.decrease(size);
    }

    public void cancel(char size) {
        action.increase(size);
    }

    public void returnRoom(char size) {
        action.increase(size);
    }

    public void showRoomCurrent() {
        action.getMeetingRoom();
    }
}
