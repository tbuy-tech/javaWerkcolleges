package oefening2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Evalf testing = new Evalf();
        Message alé = new Message(new Date(2021,2,1), new Date(2021,05,25),"Hallo ik ben Thomas", "test" );
        Message olé = new Message(new Date(2021,2,1), new Date(2021,05,23),"Hallo ik ben Jef", "test" );

        testing.post(alé);
        testing.post(olé);
        testing.display();

    }
    }


