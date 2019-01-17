package satedshark.com.vk.minorityopinion.database;

public class DatabaseSheme {
    public static final class PlayersTable{
        public static final String NAME = "player_table";
        public static final  class Columns{
            public static final String PLAYER_NUMBER = "player_number";
            public static final String PLAYER_NAME = "player_name";
            public static final String PLAYER_ACCOUNT = "player_account";
            public static final String PLAYER_PASSWORD = "player_password";
        }
    }
    public static final class GamesTable{
        public static final String NAME = "string_table";
        public static final class Columns{
            public static final String GAME_NUMBER = "gaem_number";
            public static final String DATE = "date";
            public static final String QUESTION = "question";
            public static final String ANSWER_A = "answer_a";
            public static final String ANSWER_B = "answer_b";
            public static final String COUNT_A = "count_a";
            public static final String COUNT_B = "count_b";
            public static final String BATE = "bate";
        }
    }
}
