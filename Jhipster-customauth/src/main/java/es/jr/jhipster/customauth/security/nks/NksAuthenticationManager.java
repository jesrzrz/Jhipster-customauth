package es.jr.jhipster.customauth.security.nks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import es.jr.jhipster.customauth.security.AuthoritiesConstants;

@Component
public class NksAuthenticationManager implements AuthenticationManager{

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String pw       = authentication.getCredentials().toString();

        // to add more logic
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority(AuthoritiesConstants.USER));
        return new UsernamePasswordAuthenticationToken(username, pw, grantedAuths);

    }
    
    /*
     * 
     * public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String username = authentication.getPrincipal() + "";
    String password = authentication.getCredentials() + "";

    User user = userRepo.findOne(username);
    if (user == null) {
        throw new BadCredentialsException("1000");
    }
    if (user.isDisabled()) {
        throw new DisabledException("1001");
    }
    if (!encoder.matches(password, user.getPassword())) {
        throw new BadCredentialsException("1000");
    }
    List<Right> userRights = rightRepo.getUserRights(username);
    return new UsernamePasswordAuthenticationToken(username, password, userRights.stream().map(x -> new SimpleGrantedAuthority(x.getName())).collect(Collectors.toList()));
}
     * 
     * 
     * 
     */
    
    

}
