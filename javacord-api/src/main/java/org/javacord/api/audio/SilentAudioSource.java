package org.javacord.api.audio;

public class SilentAudioSource implements AudioSource {

    public static final byte[] SILENCE_FRAME = {(byte) 0xF8, (byte) 0xFF, (byte) 0xFE};

    @Override
    public byte[] getNextFrame() {
        return SILENCE_FRAME;
    }

    @Override
    public boolean hasNextFrame() {
        return true;
    }

    @Override
    public AudioSource copy() {
        return new SilentAudioSource();
    }
}
