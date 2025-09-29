package kr.co.oreb.dp.chapter03.decorator.stream;

import java.io.FilterInputStream;
import java.io.InputStream;
import lombok.SneakyThrows;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    @SneakyThrows
    public int read() {
        int b = in.read();

        if (b == -1) {
            return -1;
        }

        return toLowerCase(b);
    }

    @Override
    @SneakyThrows
    public int read(byte[] b, int off, int len) {

        int read = in.read(b, off, len);

        if (read == -1) {
            return -1;
        }

        for (int i = off; i < off + read; i++) {
            b[i] = (byte) toLowerCase(b[i]);
        }

        return read;
    }

    private int toLowerCase(int b) {

        if ('A' <= b && b <= 'Z') {
            //대문자 -> 소문자
            b = Character.toLowerCase(b);
        }

        return b;
    }
}
