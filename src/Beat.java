import javax.sound.midi.MidiChannel;

/**
 * Class Beat
 * @version 1.0
 * @author JPery
 */
public class Beat{
	
	private final static short A = 0;
	private final static short Bb = 1;
	private final static short B = 2;
	private final static short C = 3;
	private final static short Db = 4;
	private final static short D = 5;
	private final static short Eb = 6;
	private final static short E = 7;
	private final static short F = 8;
	private final static short Gb = 9;
	private final static short G = 10;
	private final static short Ab = 11;
	private static MidiChannel[] channels;
	
	public static void insertMidiChannel(MidiChannel[] _channels){
		channels = _channels;
	}
	
	/**
	 * Plays a note in the chosen scale and the desired volume
	 * @param note Note to play
	 * @param octave
	 * @param volume
	 */
	private static void note(short note, int octave, int volume){
		switch (note){
			case A:
				channels[0].noteOn(12 * octave + 9, volume );
				break;
			case Bb:
				channels[0].noteOn(12 * octave + 10, volume );
				break;
			case B:
				channels[0].noteOn(12 * octave + 11, volume );
				break;
			case C:
				channels[0].noteOn(12 * octave, volume );
				break;
			case Db:
				channels[0].noteOn(12 * octave + 1, volume );
				break;
			case D:
				channels[0].noteOn(12 * octave + 2, volume );
				break;
			case Eb:
				channels[0].noteOn(12 * octave + 3, volume );
				break;
			case E:
				channels[0].noteOn(12 * octave + 4, volume );
				break;
			case F:
				channels[0].noteOn(12 * octave + 5, volume );
				break;
			case Gb:
				channels[0].noteOn(12 * octave + 6, volume );
				break;
			case G:
				channels[0].noteOn(12 * octave + 7, volume );
				break;
			case Ab:
				channels[0].noteOn(12 * octave + 8, volume );
				break;
			default:
				break;
		}					
	}
	
	/**
	 * Stops the chosen note.
	 * @param note Note to stop
	 * @param octave 
	 * @param volume 
	 */
	private static void stop(short note, int octave, int volume){
		switch (note){
			case A:
				channels[0].noteOff(12 * octave + 9, volume );
				break;
			case Bb:
				channels[0].noteOff(12 * octave + 10, volume );
				break;
			case B:
				channels[0].noteOff(12 * octave + 11, volume );
				break;
			case C:
				channels[0].noteOff(12 * octave, volume );
				break;
			case Db:
				channels[0].noteOff(12 * octave + 1, volume );
				break;
			case D:
				channels[0].noteOff(12 * octave + 2, volume );
				break;
			case Eb:
				channels[0].noteOff(12 * octave + 3, volume );
				break;
			case E:
				channels[0].noteOff(12 * octave + 4, volume );
				break;
			case F:
				channels[0].noteOff(12 * octave + 5, volume );
				break;
			case Gb:
				channels[0].noteOff(12 * octave + 6, volume );
				break;
			case G:
				channels[0].noteOff(12 * octave + 7, volume );
				break;
			case Ab:
				channels[0].noteOff(12 * octave + 8, volume );
				break;
			default:
				break;
		}					
	}
	
	/**
	 * Plays a beat.
	 * @param lenght of the note, number of the beat.
	 * @throws InterruptedException
	 */
	public static void play(long length, int beat) throws InterruptedException{
		switch(beat){
		case 0:
			note(A,6,80);
			Thread.sleep(length);
			stop(A,6,80);
			note(E,6,80);
			Thread.sleep(length/2);
			stop(E,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 1:
			note(G,6,80);
			Thread.sleep(length);
			stop(G,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			note(E,6,80);
			Thread.sleep(length/2);
			stop(E,6,80);
			break;
		case 2:
			note(D,6,80);
			Thread.sleep(length);
			stop(D,6,80);
			note(D,6,80);
			Thread.sleep(length/2);
			stop(D,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 3:
			note(A,6,80);
			Thread.sleep(length);
			stop(A,6,80);
			note(G,6,80);
			Thread.sleep(length/2);
			stop(G,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 4:
		case 12:
			note(E,6,80);
			Thread.sleep(length);
			stop(E,6,80);
			note(E,6,80);
			Thread.sleep(length/2);
			stop(E,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 5:
		case 13:
			note(G,6,80);
			Thread.sleep(length);
			stop(G,6,80);
			note(A,6,80);
			Thread.sleep(length);
			stop(A,6,80);
			break;
		case 6:
		case 14:
			note(F,6,80);
			Thread.sleep(length);
			stop(F,6,80);
			note(D,6,80);
			Thread.sleep(length);
			stop(D,6,80);
			break;
		case 7:
		case 15:
			note(D,6,80);
			Thread.sleep(length*2);
			stop(D,6,80);
			break;
		case 8:
			Thread.sleep(length/2);
			note(G,6,80);
			Thread.sleep(length);
			stop(G,6,80);
			note(Bb,6,80);
			Thread.sleep(length/2);
			stop(Bb,6,80);
			break;
		case 9:
			note(D,7,80);
			Thread.sleep(length/2);
			stop(D,7,80);
			note(D,7,80);
			Thread.sleep(length/2);
			stop(D,7,80);
			note(C,7,80);
			Thread.sleep(length/2);
			stop(C,7,80);
			note(Bb,6,80);
			Thread.sleep(length/2);
			stop(Bb,6,80);
			break;
		case 10:
			note(A,6,80);
			Thread.sleep(length);
			Thread.sleep(length/2);
			stop(A,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 11:
			note(A,6,80);
			Thread.sleep(length/2);
			stop(A,6,80);
			note(A,6,80);
			Thread.sleep(length/2);
			stop(A,6,80);
			note(G,6,80);
			Thread.sleep(length/2);
			stop(G,6,80);
			note(F,6,80);
			Thread.sleep(length/2);
			stop(F,6,80);
			break;
		case 17:
		case 22:
		case 25:
			note(F,6,80);
			Thread.sleep(length*2);
			stop(F,6,80);
			break;
		case 18: 		
			note(D,6,80);
			Thread.sleep(length*2);
			stop(D,6,80);
			break;
		case 19:
			note(Db,6,80);
			Thread.sleep(length*2);
			stop(Db,6,80);
			break;
		case 20:
		case 24:
			note(E,6,80);
			Thread.sleep(length*2);
			stop(E,6,80);
			break;
		case 21:
		case 26:
			note(A,6,80);
			Thread.sleep(length*2);
			stop(A,6,80);
			break;
		case 23:
			note(G,6,80);
			Thread.sleep(length*2);
			stop(G,6,80);
			break;
		default:
			Thread.sleep(length*2);
		}
	}
}