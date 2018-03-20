package com.tasks3.linkedlist;

public class LinkedList {
    private Node begin;
    private Node end;
    private int num_ofEllem;

    //конструктор без аргументів
    public LinkedList() {
        begin = new Node();
        end = begin;
        this.num_ofEllem = 0;
    }
    /* Додати елемент в кінець списку */

    public void add(Integer data) {
        end.setNext(new Node());
        end = end.getNext();
        end.setData(data);
        this.num_ofEllem++;
    }
    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        Node tbegin = begin;
        for(int i = 0; i < index + 1 ; i++)
        {
            tbegin = tbegin.getNext();
        }
        return tbegin.getData();
    }
    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        Node tbegin = begin;
        if ((index < 0)||(index >= this.num_ofEllem))
            return false;
        for (int i = 0; i < index; i++) {
            if (tbegin != null)
                tbegin = tbegin.getNext();
            else
                return false;
        }
        if(tbegin.getNext().getNext() != null)
        {
            tbegin.setNext(tbegin.getNext().getNext());
        }
        else
        {
            tbegin.setNext(null);
            end = tbegin;
        }
        num_ofEllem--;
        return true;

    }
    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        return this.num_ofEllem;

    }

}
