package AlfredBot;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Welcome, " + name + ". It's great to see you today.";
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "Today is " + currentDate.toString();
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Hold on, I think Alexis is trying to get your attention.";
        } else if (conversation.contains("Alfred")) {
            return "Yes, how can I help you?";
        } else {
            return "I'm not sure how I can assist with that.";
        }
    }
    
    public String yell(String text) {
        return text.toUpperCase() + "!";
    }
}
