const AGE = 20;
const BIRTH = '010101'
//# export : 해당 파일 외부에서 특정 변수 혹은 함수등을 사용 할 수 있도록 내보내는 역할
//^ export 요소; -> 파일의 요소로import를 할 수 있도록 함
//^                 한 파일 내에서 여러개를 export로 내보낼 수 있음
//^                 import 하는 파일에서 받아올 때
//^                 import { 요소, 요소, ... } from '파일경로';
//^                 로 받을 수 있음
//! export 요소; 로 내보낸 요소는 import 할 때 내보낸 요소의 이름과 동일한 이름으로 받아야 함
export const NAME = 'aaa';
export const PHONE = '010-000';

//^ export default 요소; -> 파일의 기본 값으로 import를 할 수 있도록 함
//^                         한 파일 내에서 하나만 export default로 내보낼 수 있음
//^                         import 하는 파일에서 받아올 때
//^                         import 이름 from '파일경로';
//^                         로 받을 수 있음
//! export default 요소; 로 내보낸 요소는 import 할 때 내보낸 요소의 이름과 달라도 됨
export default AGE;
// export default BIRTH;

export const PAGES = [
    {
        title:'Naver',
        viewValue:'NaverSignIn',
    },
    {
        title:'Kakao',
        viewValue:'KakaoSignIn'
    },
    {
        title:'ES6 + Typescript',
        viewValue:'es6TypeScript'
    },
    {
        title:'JSX + TSX',
        viewValue:'jsxTsx'
    }
]