interface ResponseDto {
    address: string;
    email: string;
    expiredTime: number;
    nickName: string;
    profile: string | null;
    telNumber: string;
    token: string;
}

export default ResponseDto;