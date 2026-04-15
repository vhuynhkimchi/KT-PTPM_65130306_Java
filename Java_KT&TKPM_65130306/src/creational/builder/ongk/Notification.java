package creational.builder.ongk;

public class Notification {
    private String title, message, icon,sound, priority, actionButtons;

    private Notification(Builder b) {
        this.title = b.title;
        this.message = b.message;
        this.icon = b.icon;
        this.sound = b.sound;
        this.priority = b.priority;
        this.actionButtons = b.actionButtons;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", icon='" + icon + '\'' +
                ", sound='" + sound + '\'' +
                ", priority='" + priority + '\'' +
                ", action_buttons='" + actionButtons + '\'' +
                '}';
    }

    public static class Builder{
        private String title, message, icon,sound, priority, actionButtons;

        public Builder buildTitle(String title){
            this.title = title;
            return this;
        }
        public Builder buildMessage(String message){
            this.message = message;
            return this;
        }
        public Builder buildIcon(String icon){
            this.icon = icon;
            return this;
        }
        public Builder buildSound(String Sound){
            this.sound = sound;
            return this;
        }
        public Builder buildPriority(String priority){
            this.priority = priority;
            return this;
        }
        public Builder buildActionbnt(String actionButtons){
            this.actionButtons = actionButtons;
            return this;
        }
        public Notification build(){
            return new Notification(this);
        }
    }
}
