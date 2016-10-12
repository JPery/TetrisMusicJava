import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 * Class Music
 * @version 1.0
 * @author JPery
 */
public class Music extends Thread{
	
	Synthesizer synth;
	boolean finished;
	
	public Music(){
		try {
			synth = MidiSystem.getSynthesizer();
			synth.open();
			Beat.insertMidiChannel(synth.getChannels());
			finished=false;
		} catch (MidiUnavailableException e) {
			System.out.println("Error loading music.");
		}
	}
	
	/**
	 * Returns in miliseconds the length of a note
	 * @param tempo in bpms
	 * @return miliseconds of a note
	 */
	public long tempo(float tempo){
		   Float miliseconds = new Float((60/tempo) *1000);
		   return miliseconds.longValue();
		}
	
	/**
	 * Plays the song
	 * @param length of the notes.
	 * @throws InterruptedException
	 */
	public void play(long length) throws InterruptedException{
		int i=16; 
		int n=0;
		while(n < 2 && !finished){
			i=0;
			while(i<16 && !finished) {
				Beat.play(length,i);
				i++;
			}
			n++;
		}
		Beat.play(length,16);
		n = 0;
		while(n < 2 && !finished){
			i = 17;
			while(i<27 && !finished) {
				Beat.play(length,i);
				i++;
			}
			n++;
		}
		Beat.play(length,16);
	}
	
	public void end(){
		finished=true;
	}
	
	public void run(){
		long tempo = 144;
		long length = this.tempo(tempo);
		try {
			while(!finished){
				this.play(length);
			}
		} catch (InterruptedException e) {
			System.out.println("Error playing sound.");
			e.printStackTrace();
		}
	}
}

