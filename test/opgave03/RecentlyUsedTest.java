package opgave03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RecentlyUsedTest {

    @Test
    void add() {
        RecentlyUsed recentlyUsed = new RecentlyUsed();
        recentlyUsed.add("test1");
        recentlyUsed.add("test2");
        assertEquals("test1",recentlyUsed.getRecentlyUsed()[1]);

        //Test 1 burde ligge på index 1 da test2 addition skal skubbe test1 til index 1 (skubVenstre metoden)
    }

    @Test
    void remove() {
        RecentlyUsed recentlyUsed = new RecentlyUsed();
        recentlyUsed.add("test1");
        recentlyUsed.add("test2");
        recentlyUsed.add("test3");
        recentlyUsed.remove(1);
        assertEquals("test1",recentlyUsed.getRecentlyUsed()[1]);

        //Test 3 ligger nu på index 0 grundet skub metoden, derfor burde test1 ligge på index 1 da test2 fjernes.

    }

    @Test
    void getRecentlyUsed() {
        RecentlyUsed recentlyUsed = new RecentlyUsed();
        recentlyUsed.add("test1");
        recentlyUsed.add("test2");
        recentlyUsed.add("test3");
        recentlyUsed.add("test4");
        recentlyUsed.add("test5");
        recentlyUsed.add("test6");
        assertEquals("test6",recentlyUsed.getRecentlyUsed()[0]);
        assertEquals("test5",recentlyUsed.getRecentlyUsed()[1]);
        assertEquals("test4",recentlyUsed.getRecentlyUsed()[2]);
        assertEquals("test3",recentlyUsed.getRecentlyUsed()[3]);
        assertEquals("test2",recentlyUsed.getRecentlyUsed()[4]);

        //Test 6 burde ligge på index 0 da den er den nyeste tilføjede, og test2 burde ligge på index 4 da den er den ældste tilføjede.
    }
}