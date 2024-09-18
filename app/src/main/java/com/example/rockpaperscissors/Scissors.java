package com.example.rockpaperscissors;

public class Scissors
{
    public String comparewite()
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
