package com.example.rockpaperscissors;

public class Scissors extends  GameElement
{
    @Override
    public String compareWith(GameElement other)
    {
        if(other instanceof Scissor)
        {
            return "it's a Tie!";
        }
        else if(other instanceof Paper )
        {
            return "You win!";
        }
        else
        {
            return "You lose!";
        }
    }
}
