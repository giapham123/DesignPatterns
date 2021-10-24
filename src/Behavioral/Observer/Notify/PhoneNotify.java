package Behavioral.Observer.Notify;

import Behavioral.Observer.Base.Observer;
import Behavioral.Observer.Base.Subject;
import Behavioral.Observer.VideoData;

public class PhoneNotify extends Observer {

    public PhoneNotify(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public void notify(Subject subject) {
        if(subject instanceof VideoData){
            VideoData videoData = (VideoData) subject;
            System.out.println("Notify via phone \n" +
                    videoData.getTitle() +"\n"+ videoData.getDesc() +"\n"+ videoData.getFileName());
        }
    }
}
