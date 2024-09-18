package com.example.rockpaperscissors;

public class Paper extends GameElement
{
    @Override
    public String compareWith(GameElement other)
    {
        if(other instanceof Paper)
        {
            return "it's a Tie!";
        }
        else if(other instanceof Rock )
        {
            return "You win!";
        }
        else
        {
            return "You lose!";
        }
    }
}
