package Behavioral.Observer;

import Behavioral.Observer.Notify.EmailNotify;
import Behavioral.Observer.Notify.PhoneNotify;
import Behavioral.Observer.Notify.YotubeNotify;

public class main {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        EmailNotify emailNotify = new EmailNotify(videoData);
        PhoneNotify phoneNotify = new PhoneNotify(videoData);
        YotubeNotify yotubeNotify = new YotubeNotify(videoData);

        videoData.setTitle("Observer design pattern");
        videoData.detachObserver(phoneNotify);
        videoData.setDesc("gias");

    }
}
