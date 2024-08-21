package com.example.Smart.Home.Server.App.enumeration;

public enum Room {
        LIVING_ROOM("LIVING_ROOM"),
        BIG_BEDROOM("BIG_BEDROOM"),
        SMALL_BEDROOM("SMALL_BEDROOM"),
        BATHROOM("BATHROOM"),
        HALL("HALL");

        private final String room;

        Room(String room) {
            this.room = room;
        }

        public String getRoom() {
            return this.room;
        }

    }

