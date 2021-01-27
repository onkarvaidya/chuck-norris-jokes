package guru.springframework.jokes.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /** Commented to show Java based configuration
    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    */
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
