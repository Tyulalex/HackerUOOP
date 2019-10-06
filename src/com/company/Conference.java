package com.company;

public class Conference {

    String topic;
    static int PERIOD;
    final static String IT_CONFERENCE_TOPIC = "web programming";

    public Conference(String topic) {
        this.topic = topic;
    }

    Conference() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    void showTopic() {
        System.out.println(this.topic);
    }

    static void showPeriod() {
        System.out.println(PERIOD);
    }

    static Conference itConference() {
        return new Conference(IT_CONFERENCE_TOPIC);
    }

    public static void main(String[] args) {
        Conference.PERIOD = 1;
        showPeriod();
        Conference medicalConference = new Conference();
        medicalConference.setTopic("New in therapy");
        medicalConference.showTopic();
        Conference itConference = Conference.itConference();
        System.out.println(itConference.getTopic());
    }

}