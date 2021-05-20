package com.design.pattern.chain.builderchain;

import com.design.pattern.chain.Member;

public abstract class Handler<T> {

    protected Handler handler;

    public void next(Handler handler) {
        this.handler = handler;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
