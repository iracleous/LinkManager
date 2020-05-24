package gr.codehub.linkmanager.entities;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LinkCollection {

    private List<Link> links = new ArrayList<>();

    //Crud implementation
    // create read update delete

//create
    public void addLink(Link link){
        links.add(link);
    }


//read  one by index
    public Link getLinkById(int index)
    {
        if (index>=links.size() || index<0) return null;
        return links.get(index);
    }

    //read  up to 10 by keyword
    public List<Link> getLinkByKeywordFirstTen(String keyword)
    {
        ArrayList<Link> resultList = new ArrayList<>();
        int counter = 0;
        for(Link link :links) {

            for (String tag: link.getKeywords()){
                if (tag.contains(keyword)){
                    counter ++;
                    resultList.add(link);
                    break;
                }
            }

            if (link.getDescription().contains(keyword)) {
                counter ++;
                resultList.add(link);
            }
            if (counter == 10)
                break;
        }
        return resultList;
    }

    //update
    public void updateTags (int linkId, String newTag)
    {
        links.get(linkId).getKeywords().add(newTag);
    }

    //delete
    public void delete(int linkId)
    {
        links.remove(linkId);
    }

    //saveToFile
    public void saveToFile(String filename){
        File outfile = new File(filename);
        try {
            PrintWriter pw = new PrintWriter(outfile);
            for (Link link : links){
                pw.println(link.getUrl() +","
                        + link.getDescription() +","
                       + link.getAuthor()   +","

                + link.getCreationDate()+","
                + link.getKeywords()   );
            }
            pw.close();
        }
          catch(Exception e){

            System.out.println("Cannot save to file");
        }
    }

    //loadFromFile

public void loadFromFile(String filename)
{
    File outfile = new File(filename);
    try {
        Scanner reader = new Scanner(outfile);
        String line;
         while (reader.hasNext()){
            line = reader.nextLine();
            String []words = line.split(",");

            Link link = new Link(words[0], words[1], null, new Date(), words[2], false, 0);
            links.add(link);
        }
         reader.close();
    }
    catch(Exception e){

        System.out.println("Cannot load from  file");
    }
    
}






}
