package satedshark.com.vk.minorityopinion;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import android.text.format.DateFormat;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FristFragment extends Fragment {

    private RecyclerView mGameList;
    private GameAdapter mAdapter;


    public FristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frist, container, false);

        mGameList = view.findViewById(R.id.game_llist_container);
        mGameList.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI(){
        GameLab gameLab = GameLab.get();
        List<Game> games = gameLab.getGames();
        mAdapter = new GameAdapter(games);
        mGameList.setAdapter(mAdapter);
    }

    private class GameHolder extends RecyclerView.ViewHolder{

        private TextView mQeustion;
        private TextView mDate;
        private Button mPlayButton;
        private Game mGame;

        public GameHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.list_item_game, parent, false));
            mQeustion = itemView.findViewById(R.id.game_question);
            mDate = itemView.findViewById(R.id.game_date);
            mPlayButton = itemView.findViewById(R.id.game_play_button);
        }

        public void bind(Game game){
            mGame = game;
            mQeustion.setText(mGame.getQuestion());
            mDate.setText(DateFormat.format("EEEE, MMM d, yyyy", mGame.getDate()) + " "
            + mGame.getBate());
        }
    }



    private class GameAdapter extends RecyclerView.Adapter<GameHolder>{

        private List<Game> mGames;

        public GameAdapter(List<Game> games){
            mGames = games;
        }

        @NonNull
        @Override
        public GameHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new GameHolder(layoutInflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull GameHolder gameHolder, int i) {
            gameHolder.bind(mGames.get(i));
        }

        @Override
        public int getItemCount() {
            return mGames.size();
        }
    }

}
