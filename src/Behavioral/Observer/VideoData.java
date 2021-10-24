package Behavioral.Observer;

import Behavioral.Observer.Base.Subject;

public class VideoData extends Subject {
    private String title;
    private String desc;
    private String fileName;
    public void VideoDataChanged(){
        NotifyObserver(this);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        VideoDataChanged();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        VideoDataChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        VideoDataChanged();
    }
}
