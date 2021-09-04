package com.jpa.demo.Mainpackage;

public class Message {
		private int id;
		private String to;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Message [id=" + id + ", to=" + to + ", name=" + name + "]";
		}
		public Message(int id, String to, String name) {
			super();
			this.id = id;
			this.to = to;
			this.name = name;
		}
		public Message() {
			super();
		}
		
}
