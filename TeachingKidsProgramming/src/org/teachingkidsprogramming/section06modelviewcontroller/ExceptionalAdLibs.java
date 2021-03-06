package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edVerb = askEdverb();
    String bodyPart = askBodyPart();
    String currentStory = "Today I woke" + adverb + ".Then I" + edVerb + "my" + bodyPart;
    MessageBox.showMessage(currentStory);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    if (askAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return adverb;
  }
  public static String askEdverb()
  {
    String edVerb = MessageBox.askForTextInput("What is the ed-verb");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb ending with ed");
      edVerb = askEdverb();
    }
    return edVerb;
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the body part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Pleas enter a body part");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("No body, no story, pay attention and start over!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
}