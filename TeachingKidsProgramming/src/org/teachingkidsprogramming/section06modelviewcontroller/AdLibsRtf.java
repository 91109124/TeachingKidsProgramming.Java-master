package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    //adverb
    private String adverb;
    // edverb
    private String edVerb;
    //bodypart
    private String bodyPart;
  }
  public static void main(String[] args)
  {
    // MVC Pattern- model, view, controller
    Words words = new Words(); //model
    words.adverb = MessageBox.askForTextInput("Enter an adverb");
    words.edVerb = MessageBox.askForTextInput("Enter a verb ending with -ed");
    words.bodyPart = MessageBox.askForTextInput("Enter a body part");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    String currentStory = Parser.parseRtfFile("view.rtf", words); //controller
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile(currentStory);
  }
}