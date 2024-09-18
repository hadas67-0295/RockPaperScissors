package com.example.rockpaperscissors;

public class Paper
{
    @Override
    public String comparewite()
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
