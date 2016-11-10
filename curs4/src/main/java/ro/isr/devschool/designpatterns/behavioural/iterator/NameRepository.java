package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 10/11/16.
 */
public class NameRepository implements Container {
    public String[] names = { "Robert", "Catalin", "Alin", "Ionut" };

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext(){
            if ( index < names.length ){
                return true;
            }
            return false;
        }

        @Override
        public String next(){
            if( this.hasNext() ){
                return  names[index++];
            }
            return null;
        }

    }

}
