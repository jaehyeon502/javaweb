import { useState } from 'react'
import KakaoSignIn from './views/KakaoSignIn';
import NaverSignIn from './views/NaverSignIn'

export default function App() {
    const [view, setView] = useState<string>("");
    return (
        <div>
            <button onClick={() => setView('NaverSignIn')}>네이버 회원가입 화면</button>
            <div>
                {view === 'NaverSignIn' && (<NaverSignIn />)}
                <KakaoSignIn />
            </div>
        </div>
    )
}
