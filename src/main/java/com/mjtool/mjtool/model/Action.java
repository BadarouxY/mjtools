package com.mjtool.mjtool.model;

import javax.persistence.*;

@Entity
@Table(name = "actions")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "amount")
    private int amount;
    @OneToOne
    private Character giver;
    @OneToOne
    private Character receiver;
    @Column(name = "action_abstract")
    private String actionAbstract;
    @ManyToOne
    private Fight fight;


    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Character getGiver() {
        return giver;
    }

    public void setGiver(Character giver) {
        this.giver = giver;
    }

    public Character getReceiver() {
        return receiver;
    }

    public void setReceiver(Character receiver) {
        this.receiver = receiver;
    }

    public String getActionAbstract() {
        return actionAbstract;
    }

    public void setActionAbstract(String actionAbstract) {
        this.actionAbstract = actionAbstract;
    }
}
