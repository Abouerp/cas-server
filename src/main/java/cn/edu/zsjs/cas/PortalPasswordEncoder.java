package cn.edu.zsjs.cas;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author techial
 */
public class PortalPasswordEncoder implements PasswordEncoder {
    private final PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public String encode(CharSequence charSequence) {
        return passwordEncoder.encode(charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return passwordEncoder.matches(charSequence, s);
    }
}
