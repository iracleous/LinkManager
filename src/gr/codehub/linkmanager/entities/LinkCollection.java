package gr.codehub.linkmanager.entities;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
                pw.println(link.getAuthor()   +","
                + link.getDescription() +","
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

public void loadFromFile()
{
    
}






}
