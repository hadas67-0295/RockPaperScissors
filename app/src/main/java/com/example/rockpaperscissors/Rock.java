package com.example.rockpaperscissors;

public class Rock
{
    public String comparewite()
    {
        if(other instanceof Rock)
        {
            return "it's a Tie!";
        }
        else if(other instanceof Scissor )
        {
            return "You win!";
        }
        else
        {
            return "You lose!";
        }
    }
}
