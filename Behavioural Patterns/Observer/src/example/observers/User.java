package example.observers;

import example.platform.Group;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribe(Group group) {
        group.registerObserver(this); //register as observer to group
        System.out.print("\n" + this.name + " subscribes " + group.getName() + "\n");
    }

    public void unSubscribe(Group grp) {
        grp.removeObserver(this);  //unsubscribe from Group class
        System.out.print("\n" + this.name + " unsubscribes " + grp.getName() + "\n");
    }

    public void update(String post) {
        System.out.print("\n" + this.name + " got new post: " + post + "\n");
    }

    public String getName() {
        return name;
    }
}
