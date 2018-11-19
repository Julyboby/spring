package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: Java
 * @description: 读取文件内容，大写转换成小写
 * @author: July
 * @create: 2018-10-04 16:44
 **/
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {
        int result = super.read(bytes, offset, len);
        for (int i = offset; i < offset + result; i++) {
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }
        return result;
    }

}
